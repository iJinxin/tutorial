package ijinxin.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TutorialApplication {

    public static void main(String[] args) {

        SpringApplication.run(TutorialApplication.class, args);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository,
                           BookmarkRepository bookmarkRepository) {
        return args -> Arrays.asList("dsda", "dada", "jinxin", "ijinxin", "asdf")
                .forEach(username -> {
                    Account account = accountRepository.save(new Account(username, "password"));
                    bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + username, "A description"));
                    bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + username, "A description"));
                });
    }
}
