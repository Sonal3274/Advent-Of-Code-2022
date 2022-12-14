.PHONY: all build clean test run

all: build clean test

build:
	./gradlew build

clean:
	./gradlew clean

test:
	./gradlew test

run:
	./gradlew run