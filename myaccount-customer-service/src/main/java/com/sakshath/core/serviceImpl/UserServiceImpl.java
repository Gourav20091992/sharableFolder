//package com.sakshath.core.serviceImpl;
//
//import java.util.Objects;
//
//import org.modelmapper.ModelMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sakshath.core.Exception.UserException;
//import com.sakshath.core.constant.HttpCode;
//import com.sakshath.core.constant.ResponseMessage;
//import com.sakshath.core.entities.UserEntity;
//import com.sakshath.core.repository.UserRepository;
//import com.sakshath.core.request.LoginAdminForm;
//import com.sakshath.core.response.Response;
//import com.sakshath.core.service.UserService;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//	Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
//
//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	ModelMapper modelMapper;
//
//	@Override
//	public UserEntity saveLoginAdminCredentials(LoginAdminForm loginAdminForm) throws UserException {
//		final String method = "AddressServiceImpl : fetchAddressByCusotmerNumber(String customerNumber)";
//
//		logger.info(method);
//
//		UserEntity userObject = new UserEntity();
//
//		Response<?> response = new Response<>();
//
//		if (Objects.isNull(loginAdminForm)) {
//			logger.error("LoginAdminForm is null");
//			response.setCode(HttpCode.NULL_OBJECT);
//			response.setMessage(ResponseMessage.NULL_OBJECT_MESSAGE);
//			throw new UserException(response);
//		}
//
//		userObject.setEmailId(loginAdminForm.getEmailId());
//		userObject.setPassword(loginAdminForm.getPassword());
//		userObject.setRole(loginAdminForm.getRoleId());
//
////		UserEntity saveObject = userRepository.save(userObject);
//
//		return null;
//	}
//	public UserEntity findByEmail(String email) {
////		return userRepository.findByEmail(email);
//		return null;
//	}
//	
//	public boolean validateUserCredentials(String email,String password) {
//		
//		UserEntity userEntity = findByEmail(email);
//		return userEntity !=null && userEntity.getPassword().equals(password);
//		
//	}
//	
//}