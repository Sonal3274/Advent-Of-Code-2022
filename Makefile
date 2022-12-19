.PHONY: all test run

all: build clean lint test

build:
	./gradlew build

clean:
	./gradlew clean

lint:
	./gradlew detekt lintKotlin

test:
	./gradlew test

run:
	./gradlew run