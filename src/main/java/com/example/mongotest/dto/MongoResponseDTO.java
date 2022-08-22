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
        public JamsilDTO(List<Jamsil> jamsilList) {
            this.jamsilList = jamsilList;
        }
    }

    @Getter
    @Setter
    public static class DeoksugungDTO {
        private List<Deoksugung> deoksugungList;
        public DeoksugungDTO(List<Deoksugung> deoksugungList) {
            this.deoksugungList = deoksugungList;
        }
    }

    @Getter
    @Setter
    public static class GwanghwamoonDTO {
        private List<Gwanghwamoon> gwanghwamoonList;
        public GwanghwamoonDTO(List<Gwanghwamoon> gwanghwamoonList) {
            this.gwanghwamoonList = gwanghwamoonList;
        }
    }

    @Getter
    @Setter
    public static class YesulDTO {
        private List<Yesul> yesulList;
        public YesulDTO(List<Yesul> yesulList) {
            this.yesulList = yesulList;
        }
    }

    @Getter
    @Setter
    public static class MyeondongcathDTO {
        private List<Myeongdongcath> myeongdongcathList;
        public MyeondongcathDTO(List<Myeongdongcath> myeongdongcathList) {
            this.myeongdongcathList = myeongdongcathList;
        }
    }

    @Getter
    @Setter
    public static class HeunginjimoonDTO {
        private List<Heunginjimoon> heunginjimoonList;
        public HeunginjimoonDTO(List<Heunginjimoon> heunginjimoonList) {
            this.heunginjimoonList = heunginjimoonList;
        }
    }

    @Getter
    @Setter
    public static class DdpDTO {
        private List<Ddp> ddpList;
        public DdpDTO(List<Ddp> ddpList) {
            this.ddpList = ddpList;
        }
    }

}
