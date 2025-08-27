# Westminster Skin Consultation Manager

**Westminster Skin Consultation Manager** is a Java Swing-based desktop application designed to manage patient consultations in a skin clinic setting. This project provides a comprehensive and user-friendly graphical interface for scheduling consultations, viewing doctor profiles, maintaining patient records, managing secure attachments, and more.

> **Note:** This project is developed as part of the coursework for the undergraduate Software Engineering program.

***

## Key Features

- **Doctor Information Management:**  
  View detailed lists and profiles of available doctors, including their specialties, contact details, and licensing info[1][2][3].

- **Consultation Booking:**  
  Easily schedule new consultations by selecting the doctor, time slot, and entering patient details.

- **Secure Data Storage:**  
  Patient and consultation data are serialized and securely saved to local files for persistence between sessions[4][5][6].

- **Attachment Encryption:**  
  Patient notes and uploaded images are encrypted for privacy during storage and retrieval[7][5][4].

- **Interactive GUI:**  
  Modern, user-friendly interface using Java Swing, with visual cues and icons to enhance usability[8][4][1][9].

- **Validation and Error Handling:**  
  Comprehensive input validation, duplicate check, and real-time feedback for user actions.

- **Coursework Quality:**  
  Developed with academic rigor and code readability as part of a university software engineering module.

***

The images have been included below for the screenshots section of your README.

***

## Screenshots

Explore the look and feel of Westminster Skin Consultation Manager.  
These screenshots illustrate the transition from the command-line interface to the modern Swing-based graphical user interface.

**CLI Main Menu**
<img width="958" height="510" alt="Screenshot 2025-08-27 at 08 49 54" src="https://github.com/user-attachments/assets/da921343-69c0-48f4-b9c7-43e9a3f61ee5" />

**Home Page – Modern GUI**
<img width="1438" height="800" alt="Screenshot 2025-08-27 at 08 50 06" src="https://github.com/user-attachments/assets/7fafb4df-e620-4f46-a06a-18e53f4baad4" />

**Doctor Information Table**
<img width="1436" height="799" alt="Screenshot 2025-08-27 at 08 50 14" src="https://github.com/user-attachments/assets/ac638469-ca64-45cc-a8be-52e733f313d9" />

**Book a Consultation**
<img width="1441" height="800" alt="Screenshot 2025-08-27 at 08 50 26" src="https://github.com/user-attachments/assets/d9543569-ead7-458a-a666-1992724bffc3" />

***

## Getting Started

### Prerequisites

- Java SE 8 or higher
- (Optional) Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/westminster-skin-consultation-manager.git
   cd westminster-skin-consultation-manager
   ```

2. **Add project images**
   - Place required images (`.jpeg`, `.png`, `.jpg` as named in code) in the project root or a relevant subdirectory.

3. **Compile the source code**
   ```bash
   javac *.java
   ```

4. **Run the application**
   ```bash
   java Main
   ```

***

## Project Structure

| File/Class                   | Purpose                                                      |
|------------------------------|--------------------------------------------------------------|
| `homePageGUI.java`           | Main entry GUI; navigation dashboard                         |
| `ConsultationGUI.java`       | Consultation booking interface                               |
| `AppointmentsGUI.java`       | Lists and manages consultation appointments                  |
| `DoctorListGUI.java`         | Displays a sortable table of all doctors                     |
| `AppointmentTableModel.java` | Data model for appointments table                            |
| `ListTableModel.java`        | Data model for doctors table                                 |
| `Doctor.java`, `Patient.java`, `Consultation.java` | Entity classes for core data             |
| `Encryption.java`            | Handles simple encryption/decryption of notes and files      |
| `datePicker.java`            | Custom date picker component                                 |

***

## Coursework Statement

> This application was developed as part of the **Undergraduate Software Engineering coursework** for University of Westminster. The aim was to demonstrate practical object-oriented design, GUI development, and secure data management in a real-world healthcare scenario.

***

## Credits

- Developed by Banula Perera (2025)
- Special thanks to University of Westminster and the Software Engineering Faculty

***

## License

This project is for educational purposes. See [LICENSE](LICENSE) for more information if provided.

***

**Feel free to fork, star, or contribute to enhancements as a learning exercise!**
