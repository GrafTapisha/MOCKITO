package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterTest {
    @Test

    public void testAddFilm() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот1");
        poster.addFilm("Бладшот2");
        poster.addFilm("Бладшот3");
        poster.addFilm("Бладшот4");

        String[] expected = {"Бладшот1", "Бладшот2", "Бладшот3", "Бладшот4"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testAddFilmOne() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот1");


        String[] expected = {"Бладшот1"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testReFiUplimMax() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот20");
        poster.addFilm("Бладшот3");
        poster.addFilm("Бладшот4");
        poster.addFilm("Бладшот5");
        poster.addFilm("Бладшот6");
        poster.addFilm("Бладшот7");
        poster.addFilm("Бладшот8");
        poster.addFilm("Бладшот9");
        poster.addFilm("Бладшот10");
        poster.addFilm("Бладшот11");

        String[] expected = {"Бладшот20", "Бладшот3", "Бладшот4", "Бладшот5", "Бладшот6", "Бладшот7", "Бладшот8", "Бладшот9", "Бладшот10", "Бладшот11"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReFilm() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот1");
        poster.addFilm("Бладшот2");
        poster.addFilm("Бладшот3");
        poster.addFilm("Бладшот4");

        String[] expected = {"Бладшот4", "Бладшот3", "Бладшот2", "Бладшот1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testReFilmMin() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот1");

        String[] expected = {"Бладшот1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testReFilimMax() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот1");
        poster.addFilm("Бладшот2");
        poster.addFilm("Бладшот3");
        poster.addFilm("Бладшот4");
        poster.addFilm("Бладшот5");
        poster.addFilm("Бладшот6");
        poster.addFilm("Бладшот7");
        poster.addFilm("Бладшот8");
        poster.addFilm("Бладшот9");
        poster.addFilm("Бладшот10");

        String[] expected = {"Бладшот10", "Бладшот9", "Бладшот8", "Бладшот7", "Бладшот6", "Бладшот5", "Бладшот4", "Бладшот3", "Бладшот2", "Бладшот1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testReFilimMaxUp() {
        Poster poster = new Poster();
        poster.addFilm("Бладшот10");
        poster.addFilm("Бладшот2");
        poster.addFilm("Бладшот3");
        poster.addFilm("Бладшот4");
        poster.addFilm("Бладшот5");
        poster.addFilm("Бладшот6");
        poster.addFilm("Бладшот7");
        poster.addFilm("Бладшот8");
        poster.addFilm("Бладшот9");
        poster.addFilm("Бладшот11");


        String[] expected = {"Бладшот11", "Бладшот9", "Бладшот8", "Бладшот7", "Бладшот6", "Бладшот5", "Бладшот4", "Бладшот3", "Бладшот2", "Бладшот10"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}