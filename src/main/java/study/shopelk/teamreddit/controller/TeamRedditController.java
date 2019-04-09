package study.shopelk.teamreddit.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author occidere
 * @blog: https://blog.naver.com/occidere
 * @github: https://github.com/occidere
 * @since 2019-04-03
 */
@Slf4j
@RestController
public class TeamRedditController {

    @GetMapping("/health")
    public String health() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
//        log.info("Current Timestamp: {}", timestamp);
        return timestamp;
    }

    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam("author") String author) {
//        log.info("Author: {}", author);

        // search

        return "Search reseult of " + author;
    }
}
