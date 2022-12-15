.PHONY: all build clean lint test run

all: build clean lint test

build:
	./gradlew build

clean:
	./gradlew clean

lint:
	./gradlew lint

test:
	./gradlew test

run:
	./gradlew run
