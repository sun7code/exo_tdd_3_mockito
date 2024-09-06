package org.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DiceScoreTest {

    private Ide mockDe;
    private DiceScore diceScore;

    @Before
    public void setUp() {
        mockDe = Mockito.mock(Ide.class);
        diceScore = new DiceScore(mockDe);
    }

    @Test
    public void testScoreWhenBothDiceAreTheSame() {
        // Arrange
        when(mockDe.getRoll()).thenReturn(4);

        // Act
        int score = diceScore.getScore();

        // Assert
        assertEquals(18, score);
    }

    @Test
    public void testScoreWhenBothDiceAreSix() {
        // Arrange
        when(mockDe.getRoll()).thenReturn(6);

        // Act
        int score = diceScore.getScore();

        // Assert
        assertEquals(30, score);
    }
}
