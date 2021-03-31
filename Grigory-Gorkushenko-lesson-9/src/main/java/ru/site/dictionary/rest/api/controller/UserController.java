//package ru.site.dictionary.rest.api.controller;
//
//import ru.site.dictionary.rest.api.exception.UserNotFoundException;
//import ru.site.dictionary.rest.api.onetoone.Users;
//import ru.site.dictionary.rest.api.repository.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.http.ResponseEntity;
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//public class UserController {
//
//	@Autowired
//	UserRepository UserRepository;
//
//	@GetMapping("/user")
//	public List getAllNotes() {
//		return UserRepository.findAll();
//	}
//
//	@PostMapping("/user")
//	public Users createNote(@Valid @RequestBody Users user) {
//		return UserRepository.save(user);
//	}
//
//	@GetMapping("/user/{id}")
//	public Users getNoteById(@PathVariable(value = "id") Long userId) throws UserNotFoundException {
//		return UserRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
//	}
//
//	@PutMapping("/user/{id}")
//	public Users updateNote(@PathVariable(value = "id") Long userId, @Valid @RequestBody Users userDetails)
//			throws UserNotFoundException {
//
//		Users user = UserRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
//
//		user.setFirstName(userDetails.getFirstName());
//
//		Users updatedUser = UserRepository.save(user);
//		return updatedUser;
//	}
//
//	@DeleteMapping("/user/{id}")
//	public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long userId) throws UserNotFoundException {
//		Users user = UserRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
//
//		UserRepository.delete(user);
//		return ResponseEntity.ok().build();
//	}
//}