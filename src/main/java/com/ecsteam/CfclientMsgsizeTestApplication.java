package com.ecsteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class CfclientMsgsizeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfclientMsgsizeTestApplication.class, args);
	}

	@GetMapping("/msg/{size}")
	public Object generateMessage(@PathVariable int size) {
		Assert.isTrue(size > 0);

		StringBuilder b = new StringBuilder(size);
		for (int i = 0; i < size; ++i) {
			b.append("X");
		}

		String msg = b.toString();
		System.out.println(msg);

		Map<String, Object> ret = new HashMap<>();
		ret.put("size", size);
		ret.put("msg", msg);

		return ret;
	}
}
