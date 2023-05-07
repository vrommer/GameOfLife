package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	// Dies from under population
	@Test
	void diesWithOneNeighbor() {  // Any live cell with fewer than two live neighbours dies, as if by underpopulation.

	}

	@Test
	void diesWithZeroNeighbors() {  // Any live cell with fewer than two live neighbours dies, as if by underpopulation.

	}

	// Continues to next generation
	@Test
	void continuesWithTwoNeighbors() { // Any live cell with two or three live neighbours lives on to the next generation.

	}

	@Test
	void continuesWithThreeNeighbors() {

	}

	// Over Population
	@Test
	void diesWithFourLivingNeighbors() { // Any live cell with more than three live neighbours dies, as if by overpopulation

	}

	@Test
	void deadCellGenerates() { // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction

	}

	@Test
	void deadCellWithSingleNeighbor() {	// Dead cell doesn't generate

	}

	@Test
	void deadCellWithNoNeighbors() {	// Dead cell doesn't generate

	}

	@Test
	void deadCellWithAllNeighbors() {	// Dead cell doesn't generate

	}


}
