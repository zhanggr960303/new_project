package chapter8.houserent.view;

import chapter8.houserent.domain.House;
import chapter8.houserent.service.HouseService;
import chapter8.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;  //控制显示菜单
    private char key = ' ';   //接收用户选择

    private HouseService houseService = new HouseService(10);

    //显示房屋列表数据
    public void listHouses() {
        System.out.println("================房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null) {
                break;
            }
            System.out.println(house);
        }
        System.out.println("================房屋列表显示完成================");
    }

    //添加房屋信息
    public void addHouse() {
        System.out.println("================添加房屋================");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phoneNumber = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //注意ID是系统分配的
        House house = new House(0, name, phoneNumber, address, rent, state);
        if(houseService.add(house) == false) {
            System.out.println("房屋信息添加失败");
        }else {
            System.out.println("房屋信息添加成功");
        }

    }

    public void delHouse() {
        System.out.println("================删除房屋================");
        System.out.println("请选择待删除房屋的编号（-1退出）：");
        int delID = Utility.readInt();
        if(delID == -1) {
            System.out.println("您放弃了删除房屋信息");
            return;
        } else {
            char choice = Utility.readConfirmSelection();
            if(choice == 'Y') {
                if(houseService.del(delID)) {
                    System.out.println("================删除房屋成功================");
                }
            } else {
                System.out.println("您放弃了删除房屋信息");
                return;
            }

        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if(c == 'Y') {
            loop = false;
        }
    }

    public void findHouse() {
        System.out.println("================查找房屋信息================");
        System.out.println("请输入需要查找的ID:");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if(house != null ) {
            System.out.println(house);
        } else {
            System.out.println("没有查找到相应信息");
        }
    }

    public void update() {
        System.out.println("================修改房屋信息================");
        System.out.println("请选择待修改房屋的编号(-1代表退出):");
        int updateId = Utility.readInt();
        if(updateId == -1 ) {
            System.out.println("您放弃修改房屋信息");
            return;
        }

        House house = houseService.find(updateId);
        if(house == null) {
            System.out.println("要修改的房屋信息不存在，无法修改");
            return;
        } else {
            System.out.println("姓名（" + house.getName() + "): ");
            String name = Utility.readString(8,"");
            if(!"".equals(name)) {
                house.setName(name);
            }

            System.out.print("电话（" + house.getPhone() + "): ");
            String phone = Utility.readString(12,"");
            if(!"".equals(phone)) {
                house.setPhone(phone);
            }

            System.out.print("地址（" + house.getAddress() + "): ");
            String address = Utility.readString(20,"");
            if(!"".equals(address)) {
                house.setAddress(address);
            }

            System.out.println("租金（" + house.getRent() + "): ");
            int rent = Utility.readInt(-1);
            if(rent != -1) {
                house.setRent(rent);
            }

            System.out.println("状态（" + house.getState() + "): ");
            String state = Utility.readString(20,"");
            if(!"".equals(state)) {
                house.setState(state);
            }

            System.out.println("================修改房屋信息成功================");
        }
    }
    public void mainMenu() {

        do {
            System.out.println("================房屋出租系统菜单================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }


}




