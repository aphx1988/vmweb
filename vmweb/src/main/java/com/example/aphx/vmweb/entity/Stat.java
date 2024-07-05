package com.example.aphx.vmweb.entity;

import java.util.List;

public class Stat {

    public static class WordDesc{
        String keyword;
        String desc;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
    Long id;
    String imgSrc;
    List<WordDesc> wordDescList;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public List<WordDesc> getWordDescList() {
        return wordDescList;
    }

    public void setWordDescList(List<WordDesc> wordDescList) {
        this.wordDescList = wordDescList;
    }
}
