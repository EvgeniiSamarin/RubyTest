package ru.kpfu.itis.Samarin903;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SequenceTest {
    private Sequence sequence;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only once");
    }
    @Test
    public void init() {
        sequence = new Sequence("1", 5);
        sequence.init();
        assertThat(sequence.getOutput(), is (String.valueOf(312211)));
    }
    @Test
    public void init2() {
        sequence = new Sequence("0", 5);
        sequence.init();
        assertThat(sequence.getOutput(), is (String.valueOf(1113122110)));
    }
    @Test
    public void init3() {
        sequence = new Sequence("22", 11);
        sequence.init();
        assertThat(sequence.getOutput(), is (String.valueOf(22)));
    }

    @Test
    public void getInitialSequence() {
        sequence = new Sequence("1", 5);
        assertThat(sequence.getInitialSequence(), is (String.valueOf(1)));

    }
    @Test
    public void getInitialSequence2() {
        sequence = new Sequence("0", 5);
        assertThat(sequence.getInitialSequence(), is (String.valueOf(0)));

    }
    @Test
    public void getInitialSequence3() {
        sequence = new Sequence("22", 5);
        assertThat(sequence.getInitialSequence(), is (String.valueOf(22)));

    }
    @Test
    public void getDepth() {
        sequence = new Sequence("22", 5);
        assertThat(sequence.getDepth(), is(5));
    }
}