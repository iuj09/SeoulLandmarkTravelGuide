package com.example.mongotest.dto;

import com.example.mongotest.entity.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MongoResponseDTO {

//    private List<Landmark> lmList;
//    public MongoResponseDTO(List<Landmark> list) { this.lmList = list; }
    @Getter
    @Setter
    public static class JamsilDTO {
        private List<Jamsil> jamsilList;
        public JamsilDTO(List<Jamsil> list) {
            this.jamsilList = list;
        }
    }

    @Getter
    @Setter
    public static class DeoksugungDTO {
        private List<Deoksugung> deoksugungList;
        public DeoksugungDTO(List<Deoksugung> list) {
            this.deoksugungList = list;
        }
    }

    @Getter
    @Setter
    public static class GwanghwamoonDTO {
        private List<Gwanghwamoon> gwanghwamoonList;
        public GwanghwamoonDTO(List<Gwanghwamoon> list) {
            this.gwanghwamoonList = list;
        }
    }

    @Getter
    @Setter
    public static class YesulDTO {
        private List<Yesul> yesulList;
        public YesulDTO(List<Yesul> list) {
            this.yesulList = list;
        }
    }

    @Getter
    @Setter
    public static class MyeondongcathDTO {
        private List<Myeongdongcath> myeongdongcathList;
        public MyeondongcathDTO(List<Myeongdongcath> list) {
            this.myeongdongcathList = list;
        }
    }

    @Getter
    @Setter
    public static class HeunginjimoonDTO {
        private List<Heunginjimoon> heunginjimoonList;
        public HeunginjimoonDTO(List<Heunginjimoon> list) {
            this.heunginjimoonList = list;
        }
    }

    @Getter
    @Setter
    public static class DdpDTO {
        private List<Ddp> ddpList;
        public DdpDTO(List<Ddp> list) {
            this.ddpList = list;
        }
    }
}
