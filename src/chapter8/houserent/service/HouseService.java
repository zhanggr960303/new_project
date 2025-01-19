package chapter8.houserent.service;

import chapter8.houserent.domain.House;

public class HouseService {
    private House[] houses;

    private int housesNum = 1;
    private int idCount = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    //返回houses数组
    public House[] list() {
        return houses;
    }

    //添加新房源
    public boolean add(House newHouse) {
        if (housesNum >= houses.length) {
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        houses[housesNum] = newHouse;
        housesNum++;
        newHouse.setId(++idCount);
        return true;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < housesNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
                break;
            }
        }
        //没有找到对应的房屋信息
        if (index == -1) {
            System.out.println("输入的房屋ID有误，删除失败");
            return false;
        }

        for (int i = index; i < housesNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[housesNum - 1] = null;
        housesNum--;
        return true;
    }

    public House find(int houseId) {
        int index = -1;
        for (int i = 0; i < housesNum; i++) {
            if (houseId == houses[i].getId()) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            return houses[index];
        } else {
            return null;
        }
    }


}
