package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/test")
	public List<TestDTO> resultString() {
		List<TestDTO> dtoList = new ArrayList<>();

		for (int count = 0; count < 5; count++) {
			TestDTO dto = new TestDTO();
			dto.setId("00".concat(Integer.toString(count)));
			dto.setName(Integer.toString(count).concat("ノスケ"));
			dto.setAge(count);
			dto.setMail(Integer.toString(count).concat("@hogehoge.com"));
			dto.consoleOut();
			dtoList.add(dto);
		}
		boolean flg = dtoList.stream().allMatch(child -> "010".equals(child.getId()));
		System.out.println(flg);

		return dtoList;

	}
}
