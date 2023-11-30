package ru.geekbrains.seminar_2.homework.task3.models;


import ru.geekbrains.seminar_2.homework.task3.Column;

import java.util.UUID;

@ru.geekbrains.seminar_2.homework.task3.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
