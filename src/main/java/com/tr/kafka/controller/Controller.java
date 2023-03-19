package com.tr.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tr.kafka.model.User;

@RestController

public class Controller {
	@Autowired
	KafkaTemplate<String, String> kafkaStringTemplate;

	@Autowired
	KafkaTemplate<String, User> kafkaUserTemplate;

	private static final String TOPIC = "NewTopic";

	@GetMapping("/publishString/{message}")
	public String publishMessage(@PathVariable("message") final String message) {
		kafkaStringTemplate.send(TOPIC, message);
		return "Published Successfully";
	}

	@PostMapping("/publishUser")
	public String publishUser(@RequestBody User user) {
		kafkaUserTemplate.send(TOPIC, user);
		return "Published Successfully";
	}
}
