package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() {

        try {
           String text =  Files.readString(Paths.get("src/main/resources/hello.txt"));
            return text;
        } catch (NoSuchFileException noSuchFile) {
            return "No Such file";
        }catch(IOException otherException){
            return "Some other problem";
        }


    }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
            boolean containsText = Files.readString(Paths.get(path)).contains(expectedText);
            return true;
        } catch (NoSuchFileException noSuchFile) {
            return false;
        }catch(IOException textDoesntMatch){
            return false;
        }


    }

    public Boolean fileHasText(String filename, String expectedText)throws MissingWelcomeFileException {
        String path = "src/main/resources/" + filename;
        try {
           Boolean hasText =  (Files.readString(Paths.get(path)).contains(expectedText));
            return true;
        } catch (MissingWelcomeFileException e) {
            return false;
        }catch (IOException e){
            return false;
        }

    }
}
