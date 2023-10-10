package com.bharatmandi.cms.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bharatmandi.cms.dao.GetUserDetailsDAO;
import com.bharatmandi.cms.dto.UserDetails;
import com.bharatmandi.cms.dto.Users;

@RestController
@CrossOrigin("*")
public class CmsRestController {
	
	@Autowired
	private GetUserDetailsDAO getuserDetails;

	@GetMapping("/getUsers/{userId}")
	public Users getUsers(@PathVariable("userId") int userId){
		Users user = new Users();
		UserDetails findById = getuserDetails.findById(userId).get();
		user.setFirstName(findById.getFirstName());
		user.setLastName(findById.getLastName());
		user.setOrganizationName(findById.getOrganization().getOrganizationName());
		user.setRoleName(findById.getRoles().getRoleName());
		user.setUserId(findById.getUserId());
		
		if(!user.getRoleName().equalsIgnoreCase("Employee")) {
			List<UserDetails> findByReportsTo = getuserDetails.findByReportsTo(userId);
			getSubUsers(user, findByReportsTo);
		}
		return user;
	}
	
	public void getSubUsers(Users users, List<UserDetails> usersList){
		if(usersList != null && usersList.size() > 0) {
			users.setReportingUsers(new ArrayList<>());
			usersList.forEach(n-> {
				Users user = new Users();
				user.setFirstName(n.getFirstName());
				user.setLastName(n.getLastName());
				user.setOrganizationName(n.getOrganization().getOrganizationName());
				user.setRoleName(n.getRoles().getRoleName());
				user.setUserId(n.getUserId());
				users.getReportingUsers().add(user);
				List<UserDetails> findByReportsTo = getuserDetails.findByReportsTo(n.getUserId());
				getSubUsers(user, findByReportsTo);
			});
		}
	}
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, code = HttpStatus.INTERNAL_SERVER_ERROR)
	public void handleException(Exception e) {
		
	}
}
