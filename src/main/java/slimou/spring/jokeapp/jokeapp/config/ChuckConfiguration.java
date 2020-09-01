package slimou.spring.jokeapp.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * User: salim
 * Date: 01.09.2020 18:02
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
