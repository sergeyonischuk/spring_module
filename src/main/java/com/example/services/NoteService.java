package com.example.services;

import com.example.entities.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private List<Note> noteList;

    public List<Note> listAll() {
        return noteList;
    }

    public Note add(Note note) {
        return null;
    }

    public void deleteById(Long id) {

    }

    public void update(Note note) {

    }

    public Note getById(Long id) {
        return null;
    }
}
