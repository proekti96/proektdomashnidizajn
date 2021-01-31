FROM openjdk:8
COPY ./target/test-classes/com/app/das/DasApplicationTests/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","DasApplication"]