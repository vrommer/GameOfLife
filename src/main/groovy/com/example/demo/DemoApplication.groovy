package com.example.demo

import module.Matrix
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)

		Matrix matrix = new Matrix(3,3)
		matrix.init(  )
	}

}
