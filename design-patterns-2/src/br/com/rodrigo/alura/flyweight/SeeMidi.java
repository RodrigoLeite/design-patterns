package br.com.rodrigo.alura.flyweight;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;

public class SeeMidi {
	public static void main(String[] args) throws IOException, InvalidMidiDataException {
        Pattern pattern = MidiFileManager.loadPatternFromMidi(new File("courage.midi"));
        System.out.println(pattern);
    }
}
