//package com.sakshath.core.controller;
//
//import java.util.Arrays;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sakshath.core.Exception.AddressException;
//import com.sakshath.core.Exception.FormValidationException;
//import com.sakshath.core.Exception.InvalidAuthenticationException;
//import com.sakshath.core.constant.HttpCode;
//import com.sakshath.core.constant.ResponseMessage;
//import com.sakshath.core.constant.RestApiUrl;
//import com.sakshath.core.request.LoginAdminForm;
//import com.sakshath.core.response.AddressDto;
//import com.sakshath.core.response.Response;
//import com.sakshath.core.service.UserService;
//
//import io.swagger.annotations.Api;
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@Api(value = "UserLoginController", description = "Rest api for UserLoginController.")
//@RestController
//@RequestMapping(RestApiUrl.LOGIN_API)
//public class UserLoginController {
//
//	@Autowired
//	UserService userService;
//
//	Logger LOG = LoggerFactory.getLogger(UserLoginController.class);
//
//	@PostMapping(RestApiUrl.GET_LOGIN_URL)
//	public ResponseEntity<Response<?>> saveAdminLoginCredentials(@RequestBody LoginAdminForm loginAdminForm)
//			throws FormValidationException, InvalidAuthenticationException, AddressException {
//
//		final String method = RestApiUrl.LOGIN_API + RestApiUrl.GET_LOGIN_URL + " : saveAdminLoginCredentials()";
//
//		LOG.info(method);
//		Response<AddressDto> response = new Response<>();
//
//		// loginService.saveLoginAdminCredentials(loginAdminForm);
//
//		response.setList(Arrays.asList());
//		response.setCode(HttpCode.OK);
//		response.setMessage("Records retrieved Successfully !");
//
//		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);
//
//	}
//
//	@PostMapping(RestApiUrl.VALIDATE_USER_URL)
//	public ResponseEntity<Response<?>> loginValidations(@RequestParam String email, @RequestParam String password)
//			throws FormValidationException, InvalidAuthenticationException, AddressException {
//
//		final String method = RestApiUrl.LOGIN_API + RestApiUrl.VALIDATE_USER_URL + " : loginValidations()";
//
//		LOG.info(method);
//		Response<?> response = new Response<>();
//
//		if (userService.validateUserCredentials(email, password)) {
//
//			response.setCode(HttpCode.OK);
//			response.setMessage("Login Succesfully !");
//			return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);
//
//		}
//		response.setCode(HttpCode.NULL_OBJECT);
//		response.setMessage("Invalid User .Please provide the valid Credentials !");
//		return ResponseEntity.ok().header(ResponseMessage.APPLICATION_TYPE_JSON).body(response);
//
//	}
//
//}
