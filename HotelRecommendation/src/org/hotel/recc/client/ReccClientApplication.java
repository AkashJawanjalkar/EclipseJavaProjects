package org.hotel.recc.client;

import org.hotel.recc.model.AdminLoginModel;
import org.hotel.recc.model.AreaMasterModel;
import org.hotel.recc.model.CityMasterModel;
import org.hotel.recc.model.HotelMasterModel;
import org.hotel.recc.model.RegMasterModel;
import org.hotel.recc.repository.AdminRepository;
import org.hotel.recc.repository.AreaMasterRepository;
import org.hotel.recc.service.CityMasterService;
import org.hotel.recc.service.RegMasterService;
import org.hotel.recc.service.hotelMasterService;
import org.hotel.recc.service.hotelMasterService;

import java.util.List;
import java.util.Scanner;

public class ReccClientApplication {

	  public static void main(String[] args) {
        CityMasterModel cModel = new CityMasterModel();
        CityMasterService cms = new CityMasterService();
        AreaMasterModel aModel = new AreaMasterModel();
        AreaMasterRepository ams = new AreaMasterRepository();
        HotelMasterModel hModel = new HotelMasterModel();
        hotelMasterService hms = new hotelMasterService();
        AdminLoginModel amModelLogin = new AdminLoginModel();
        RegMasterModel rModel = new RegMasterModel();
        RegMasterService rms = new RegMasterService();

        Scanner sc = new Scanner(System.in);
        int ch;
         do{
            System.out.println("Enter choice");
            System.out.println("1: Login for Admin");
            System.out.println("2: Login for User");
            ch = sc.nextInt();
            boolean b;
            sc.nextLine();
            switch (ch) {
			
			
        case 1:
            System.out.println("Enter username ");
            String username = sc.nextLine();
            System.out.println("Enter password ");
            String password = sc.nextLine();

            AdminLoginModel loginModel = new AdminLoginModel();
            loginModel.setUsername(username);
            loginModel.setPassword(password);

            AdminRepository adminRepository = new AdminRepository();
            boolean loginSuccess = adminRepository.adminLogin(loginModel);

            if (loginSuccess) {
                System.out.println("Login successful!");// Consume the newline character

            if (ch == 1) {
                
                do {
                    System.out.println("Enter choice");
                    System.out.println("1: Add");
                    System.out.println("2: Update");
                    System.out.println("3: Delete");
                    System.out.println("4: Show/View");
                    System.out.println("5: Exit");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    switch (choice) {
                        case 1:
                            do {
                                System.out.println("Enter choice");
                                System.out.println("1: Add New City");
                                System.out.println("2: Add Area Name");
                                System.out.println("3: Add New Hotel");
                                System.out.println("4: Add Bulk City Data");
                                System.out.println("5: Exit");
                                choice = sc.nextInt();
                                sc.nextLine(); // Consume the newline character
                                switch (choice) {
                                    case 1:
                                        System.out.println("Enter City Name to add");
                                        String cityName = sc.nextLine();
                                        cModel.setCityName(cityName);
                                        b = cms.isAddNewCity(cModel);
                                        if (b) {
                                            System.out.println("City Added Successfully.");
                                        } else {
                                            System.out.println("City Not Added.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Enter City Name to add Area");
                                        cityName = sc.nextLine();
                                        int cityId = cms.getCity(cityName);
                                        if (cityId != -1) {
                                            System.out.println("Enter Area Name");
                                            String areaName = sc.nextLine();
                                            aModel.setCityId(cityId);
                                            aModel.setAreaName(areaName);
                                            b = ams.isAddArea(aModel);
                                            if (b) {
                                                System.out.println("Area added successfully.");
                                            } else {
                                                System.out.println("Area not added.");
                                            }
                                        } else {
                                            System.out.println("City Not Present in DB.");
                                            System.out.println("Do you want to add City in DB? (yes/no)");
                                            String msg = sc.nextLine();
                                            if (msg.equalsIgnoreCase("yes")) {
                                                cModel.setCityName(cityName);
                                                b = cms.isAddNewCity(cModel);
                                                if (b) {
                                                    System.out.println("City Added Successfully.");
                                                } else {
                                                    System.out.println("City Not Added.");
                                                }
                                            } else {
                                                System.out.println("---- THANK YOU ----");
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Select City to Add Hotel");
                                        cityName = sc.nextLine();
                                        cityId = cms.getCity(cityName);
                                        if (cityId != -1) {
                                            System.out.println("Enter Area Name to Add Hotel");
                                            String areaName = sc.nextLine();
                                            int areaId = ams.getArea(areaName);
                                            if (areaId != -1) {
                                                System.out.println("Enter Hotel Name");
                                                String hotelName = sc.nextLine();
                                                System.out.println("Enter Hotel Type");
                                                String hotelType = sc.nextLine();
                                                System.out.println("Enter Hotel Price");
                                                int hotelPrice = sc.nextInt();
                                                sc.nextLine(); // Consume the newline character
                                                hModel.setHname(hotelName);
                                                hModel.setHtype(hotelType);
                                                hModel.setPrice(hotelPrice);
                                                b = hms.isAddNewHotel(hModel, cityId, areaId);
                                                if (b) {
                                                    System.out.println("Hotel Added Successfully.");
                                                } else {
                                                    System.out.println("Hotel not added successfully.");
                                                }
                                            } else {
                                                System.out.println("Area not present in DB.");
                                                System.out.println("Do you want to add Area in DB? (yes/no)");
                                                String msg = sc.nextLine();
                                                if (msg.equalsIgnoreCase("yes")) {
                                                    aModel.setCityId(cityId);
                                                    aModel.setAreaName(areaName);
                                                    b = ams.isAddArea(aModel);
                                                    if (b) {
                                                        System.out.println("Area added successfully.");
                                                    } else {
                                                        System.out.println("Area not added successfully.");
                                                    }
                                                } else {
                                                    System.out.println("---- THANK YOU ----");
                                                }
                                            }
                                        } else {
                                            System.out.println("City Not Present in DB.");
                                            System.out.println("Do you want to add City in DB? (yes/no)");
                                            String msg = sc.nextLine();
                                            if (msg.equalsIgnoreCase("yes")) {
                                                cModel.setCityName(cityName);
                                                b = cms.isAddNewCity(cModel);
                                                if (b) {
                                                    System.out.println("City Added Successfully.");
                                                } else {
                                                    System.out.println("City Not Added.");
                                                }
                                            } else {
                                                System.out.println("---- THANK YOU ----");
                                            }
                                        }
                                        break;
                                    case 4:
                                        b = cms.isBulkAddCities();
                                        if (b) {
                                            System.out.println("Cities added successfully.");
                                        } else {
                                            System.out.println("Some problem occurred while adding bulk city data.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Exiting...");
                                }
                            } while (choice != 5);
                            break;
                        case 2: // update
                            do {
                                System.out.println("Enter choice");
                                System.out.println("1: Update City");
                                System.out.println("2: Update Area Name");
                                System.out.println("3: Update Hotel");
                                System.out.println("4: Exit");
                                choice = sc.nextInt();
                                sc.nextLine(); // Consume the newline character
                                switch (choice) {
                                    case 1:
                                        System.out.println("Enter cityId to Update CityName");
                                        int cityId = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Enter new CityName to update");
                                        String nCity = sc.nextLine();
                                        cModel.setCityId(cityId);
                                        cModel.setCityName(nCity);
                                        b = cms.isUpdateCity(cModel);
                                        if (b) {
                                            System.out.println("City updated successfully.");
                                        } else {
                                            System.out.println("City not updated.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Enter AreaId to update AreaName");
                                        int areaId = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Enter new Area Name");
                                        String nAreaName = sc.nextLine();
                                        aModel.setAreaId(areaId);
                                        aModel.setAreaName(nAreaName);
                                        b = ams.isUpdateArea(aModel);
                                        if (b) {
                                            System.out.println("Area updated successfully.");
                                        } else {
                                            System.out.println("Area not updated.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Enter HotelId to Update Hotel");
                                        int hId = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Enter new Hotel Name");
                                        String nHname = sc.nextLine();
                                        hModel.setHid(hId);
                                        hModel.setHname(nHname);
                                        b = hms.isUpdateHotel(hModel);
                                        if (b) {
                                            System.out.println("Hotel updated successfully.");
                                        } else {
                                            System.out.println("Hotel not updated.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Exiting...");
                                        break;
                                    default:
                                        System.out.println("Invalid choice, please try again.");
                                }
                            } while (choice != 4);
                            break;
                        case 3: // Delete
                            do {
                                System.out.println("Enter choice");
                                System.out.println("1: Delete Hotel");
                                System.out.println("2: Exit");
                                choice = sc.nextInt();
                                sc.nextLine(); // Consume the newline character
                                switch (choice) {
                                    case 1:
                                        System.out.println("Enter HotelName to Delete Hotel");
                                        String hotelName = sc.nextLine();
                                        hModel.setHname(hotelName);
                                        b = hms.isDeleteHotel(hModel);
                                        if (b) {
                                            System.out.println("Hotel Deleted successfully.");
                                        } else {
                                            System.out.println("Hotel not Deleted.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Exiting...");
                                        break;
                                    default:
                                        System.out.println("Invalid choice, please try again.");
                                }
                            } while (choice != 2);
                            break;
                        case 4: // Show/View
                            do {
                                System.out.println("Enter choice");
                                System.out.println("1: Show All Customers");
                                System.out.println("2: Show All Bookings");
                                System.out.println("3: Show All Hotels");
                                System.out.println("4: Exit");
                                choice = sc.nextInt();
                                sc.nextLine(); // Consume the newline character
                                switch (choice) {
                                    case 1:
                                        System.out.println("---- All Registered Customers ----");
                                        List<RegMasterModel> customerList = rms.getAllRegCust();
                                        if (customerList != null) {
                                            customerList.forEach(m -> System.out.println(m.getRid() + "\t" + m.getName() + "\t" + m.getEmail() + "\t" + m.getContact()));
                                        } else {
                                            System.out.println("No customers present.");
                                        }
                                        break;
                                    case 2:
                                        // Implementation for showing all bookings (missing in provided code)
                                        break;
                                    case 3:
                                        System.out.println("---- All Hotels ----");
                                        List<HotelMasterModel> hotelList = hms.getAllHotels();
                                        if (hotelList != null) {
                                            hotelList.forEach(m -> System.out.println(m.getHid() + "\t" + m.getHname()));
                                        } else {
                                            System.out.println("No hotels present.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Exiting...");
                                        break;
                                    default:
                                        System.out.println("Invalid choice, please try again.");
                                }
                            } while (choice != 4);
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                    }
                } while (ch != 5);
            } else if (ch == 2) {
                do {
                    System.out.println("---- Hey User, Welcome ----");
                    System.out.println("Enter choice");
                    System.out.println("1: Register New User");
                    System.out.println("2: I Am Registered User ---> Login Now");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    switch (choice) {
                        case 1:
                            System.out.println("---- Welcome for Registration ----");
                            System.out.println("Enter Name, Email, Contact, Username, and Password for Registration");
                            String name = sc.nextLine();
                            String email = sc.nextLine();
                            String contact = sc.nextLine();
                            String userName = sc.nextLine();
                            String Password = sc.nextLine();
                            rModel.setName(name);
                            rModel.setEmail(email);
                            rModel.setContact(contact);
                            rModel.setUserName(userName);
                            rModel.setPassword(Password);
                            b = rms.isRegCustomer(rModel);
                            if (b) {
                                System.out.println("---- Registration Successful ----");
                            } else {
                                System.out.println("There was a problem with registration.");
                            }
                            break;
                        case 2:
                            System.out.println("---- Welcome for Login ----");
                            System.out.println("Enter Username and Password");
                            userName = sc.nextLine();
                            password = sc.nextLine();
                            rModel.setUserName(userName);
                            rModel.setPassword(password);
                            if (rms.isLoginUser(rModel)) {
                                System.out.println("------- Welcome ------- Login Successful -------");
                                do {
                                    System.out.println("Enter Choice");
                                    System.out.println("1: View All Hotels");
                                    System.out.println("2: View Hotel by Price");
                                    System.out.println("3: View Hotels by Ratings");
                                    System.out.println("4: Exit");
                                    choice = sc.nextInt();
                                    sc.nextLine(); // Consume the newline character
                                    switch (choice) {
                                        case 1:
                                            System.out.println("---- All Hotels ----");
                                            List<HotelMasterModel> hotelList = hms.getAllHotels();
                                            if (hotelList != null) {
                                                hotelList.forEach(m -> System.out.println(m.getHid() + "\t" + m.getHname() + "\t" + m.getHtype() + "\t" + m.getPrice()));
                                            } else {
                                                System.out.println("No hotels present.");
                                            }
                                            break;
                                        case 2:
                                            // Implementation for viewing hotels by price (missing in provided code)
                                            break;
                                        case 3:
                                            // Implementation for viewing hotels by ratings (missing in provided code)
                                            break;
                                        case 4:
                                            System.out.println("Exiting...");
                                            break;
                                        default:
                                            System.out.println("Invalid choice, please try again.");
                                    }
                                } while (choice >= 4);
                            } else {
                                System.out.println("Invalid Username or Password.");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                    }
                } while (ch!= 2);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
         
   }
         while(ch!=2);
	  }
}
