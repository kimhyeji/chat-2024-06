package com.ll.chat_2024_06_03.domain.chat.catRoom.repository;

import com.ll.chat_2024_06_03.domain.chat.catRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

}
