# 🚗 Parking Lot Low-Level Design (LLD) in Java

A Java-based Parking Lot Management System designed using Object-Oriented Programming (OOP) principles and Low-Level Design (LLD) concepts.

## 📌 Features

- Multi-floor parking lot support
- Multiple vehicle types
  - Bike
  - Car
  - Truck
- Dedicated parking spots for each vehicle type
- Automatic parking spot allocation
- Ticket generation on vehicle entry
- Parking fee calculation on vehicle exit
- Strategy Pattern for pricing
- Modular and extensible architecture

---

## 🏗️ Project Structure

```
ParkingLotLLD
│
└── src
    ├── VehicleType.java
    ├── Vehicle.java
    ├── Bike.java
    ├── Car.java
    ├── Truck.java
    │
    ├── ParkingSpot.java
    ├── BikeSpot.java
    ├── CarSpot.java
    ├── TruckSpot.java
    │
    ├── ParkingFloor.java
    ├── ParkingLot.java
    ├── Ticket.java
    ├── PricingStrategy.java
    ├── HourlyPricingStrategy.java
    ├── ParkingManager.java
    └── Main.java
```

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- SOLID Principles
- Strategy Design Pattern
- Java Collections Framework

---

## 📖 Class Overview

### Vehicle
Abstract class representing all vehicle types.

### VehicleType
Enumeration containing:
- BIKE
- CAR
- TRUCK

### ParkingSpot
Represents an individual parking space.

### BikeSpot / CarSpot / TruckSpot
Specialized parking spots for each vehicle type.

### ParkingFloor
Contains multiple parking spots and allocates available spots.

### ParkingLot
Maintains all parking floors.

### Ticket
Stores parking ticket details such as:
- Ticket ID
- Entry Time
- Assigned Parking Spot

### PricingStrategy
Interface for implementing different pricing algorithms.

### HourlyPricingStrategy
Calculates parking fees based on parking duration.

### ParkingManager
Handles:
- Vehicle Entry
- Vehicle Exit
- Ticket Generation
- Parking Fee Calculation

### Main
Driver class to demonstrate the application.

---

## 🚀 How to Run

### Step 1

Open the project in Visual Studio Code.

### Step 2

Open Terminal.

### Step 3

Navigate to the source folder.

```bash
cd src
```

### Step 4

Compile all Java files.

```bash
javac *.java
```

### Step 5

Run the project.

```bash
java Main
```

---

## 💻 Sample Output

```
Vehicle Parked Successfully
Ticket ID : e3c5c18b-9d0a-4d56-a7c7-2d8efcd23456
Parking Fee : ₹20.0
```

---

## 🧩 Design Patterns Used

- Strategy Pattern
- Object-Oriented Design

---

## 📚 OOP Concepts Demonstrated

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

---

## 📈 Future Enhancements

- Entry Gate and Exit Gate
- Display Board
- Payment Gateway Integration
- Multiple Pricing Strategies
- Electric Vehicle Charging Support
- Parking Reservation
- Singleton Pattern
- Factory Pattern
- Observer Pattern
- Concurrency Handling
- JUnit Testing

---

## 🎯 Learning Objectives

This project demonstrates:

- Java Object-Oriented Programming
- Low-Level Design (LLD)
- SOLID Principles
- Strategy Design Pattern
- Clean Code Practices
- Modular Software Design

---

## 👨‍💻 Author

**Sri Harish S**
Computer Science and Engineering Student

Specialization:
- Artificial Intelligence
- Machine Learning
- Data Analytics
- Full Stack Development
- GitHub: https://github.com/SriHarish2006
- LinkedIn: linkedin.com/in/sri-harish-03219432b

---

## 📄 License

This project is created for educational and interview preparation purposes.
