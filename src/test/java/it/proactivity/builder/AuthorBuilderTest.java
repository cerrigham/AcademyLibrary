package it.proactivity.builder;

import it.proactivity.model.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorBuilderTest {
@Test
    public void createAuthor() {
    Author georgeMartin = AuthorBuilder.newAuthor(01l)
            .name("George")
            .surname("Martin")
            .nationality("American")
            .build();
    assertNotNull(georgeMartin);
    //assertEquals("George", georgeMartin.getName());
}

}