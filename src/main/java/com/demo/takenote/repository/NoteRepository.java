package com.demo.takenote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.takenote.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
