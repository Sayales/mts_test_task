package com.sayales.api;

import com.sayales.api.dto.TracksDTO;

/**
 * Интерфейс для взаимодействия с приложением
 */
public interface MTSTestTaskApi {

    /**
     * Сохранить/Обновить список треков
     *
     * @param tracks - треки для сохранения
     */
    void saveTracks(TracksDTO tracks);

    /**
     * Получить список треков
     *
     * @return - список треков из бд.
     */
    TracksDTO getTracks();

}
