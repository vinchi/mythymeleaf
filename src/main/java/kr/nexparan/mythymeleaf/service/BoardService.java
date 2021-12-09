package kr.nexparan.mythymeleaf.service;

import kr.nexparan.mythymeleaf.model.Board;
import kr.nexparan.mythymeleaf.model.User;
import kr.nexparan.mythymeleaf.repository.BoardRepository;
import kr.nexparan.mythymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
