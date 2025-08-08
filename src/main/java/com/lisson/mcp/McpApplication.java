package com.lisson.mcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class McpApplication {

	@RequestMapping("/")
	public String name() {
		return "Hello MCP Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(McpApplication.class, args);
	}

}
