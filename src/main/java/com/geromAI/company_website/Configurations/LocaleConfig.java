package com.geromAI.company_website.Configurations;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleConfig {

    @Bean
    public LocaleResolver localeResolver() {
        return new PathLocaleResolver();
    }

    public static class PathLocaleResolver implements LocaleResolver {

        private static final Locale DEFAULT_LOCALE = Locale.ENGLISH;

        @Override
        public Locale resolveLocale(HttpServletRequest request) {

            String uri = request.getRequestURI();

            if (uri != null) {

                String[] parts = uri.split("/");

                if (parts.length > 1) {

                    String language = parts[1].toLowerCase(Locale.ROOT);

                    switch (language) {
                        case "el":
                            return Locale.forLanguageTag("el");

                        case "fr":
                            return Locale.forLanguageTag("fr");

                        case "en":
                            return Locale.ENGLISH;
                    }
                }
            }

            return DEFAULT_LOCALE;
        }

        @Override
        public void setLocale(
                HttpServletRequest request,
                HttpServletResponse response,
                Locale locale
        ) {
            // Locale comes from URL.
        }
    }
}