package trailProject.trail.history.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import trailProject.trail.history.entity.History;
import trailProject.trail.history.service.HistoryService;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HistoryControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    HistoryService historyService;
//
//    @Test
//    @DisplayName("히스토리 데이터 테스트")
//    void getHistoryTest() throws Exception {
//
//        //given: Mock 객체가 특정 상황에서 해야하는 행위를 정의하는 메소드
//        given(historyService.viewHistorys(1L)).willReturn(
//                new History(1L, 10, 20220517, 20, false));
//
//        Long id = 1L;
//
//        mockMvc.perform(get("/trail/history/view") + id))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.historyId").exists())
//                .andExpect(jsonPath("$.workTime").exists())
//                .andExpect(jsonPath("$.workDate").exists())
//                .andExpect(jsonPath("$.distance").exists())
//                .andExpect(jsonPath("$.workComplete").exists())
//                .andDo(print());
//
//
//    }

}