package ru.solarsecurity.testing.tree;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Test
public class CleanTreeTest {
    private final Gson gson = new Gson();

    public void testCleanTreeDumb() throws IOException {
        List<Node> input = readTree("/initialTree.json", Node[].class);
        List<Node> expectedResult = readTree("/resultingTree.json", Node[].class);

        CleanTreeInMostStupidWayButTestShouldBeOK.cleanTree(input);
        Assert.assertEquals(gson.toJsonTree(expectedResult), gson.toJsonTree(input));
    }

    public <Node> List<Node> readTree(String fileName, Class<Node[]> clazz) throws IOException {
        try (InputStream is = CleanTreeTest.class.getResourceAsStream(fileName);
             InputStreamReader isr = new InputStreamReader(is)) {

            return new ArrayList<>(Arrays.asList(gson.fromJson(isr, clazz)));
        }
    }
}
