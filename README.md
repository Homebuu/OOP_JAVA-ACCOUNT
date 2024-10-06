# OOP_JAVA-ACCOUNT
นี่เป็นการบ้านของผมเองนะครับ หากใครเรียนภาษา java อยู่เอาไปศึกษาได้ เรื่องธนาคาร โค้ดอาจจะผิดพลาดนิดหน่อยนะครับ เพราะงานเร่งต้องส่งจารย์ 555 

# Account

เขียนโปรแกรมเพื่อสร้างคลาสระบบธนาคาร 

`1.สร้างคลาส ระบบธนาคาร `

- Superclass: Account 
- Subclass: SavingsAccount, CheckingAccount
  
`2.UML: Class Diagram `



`3.รายละเอียดของแต่ละคลาส `

Account (Superclass) 

   - Properties: balance (ยอดเงินคงเหลือในบัญชี)
   - Methods: 
        - Account(double balance): คอนสตรัคเตอร์สำหรับกำหนดยอดเงินเริ่มต้น 
        - deposit(double amount): เพิ่มยอดเงินในบัญชี 
        - withdraw(double amount): ถอนเงินจากบัญชี 
        - getBalance(): แสดงยอดเงินคงเหลือในบัญชี 
     
 SavingsAccount (Subclass)  
 
    - Properties: 
          interestRate: อัตราดอกเบี้ยเงินฝาก (เพิ่มเติมจาก Class แม่) 
    Methods: 
          SavingsAccount(double balance, double interestRate) : คอนสตรัคเตอร์สำหรับกำหนดยอดเงินและอัตราดอกเบี้ย 
          applyInterest(): คำนวณดอกเบี้ยและเพิ่มในยอดเงิน 
        
CheckingAccount (Subclass) 

    Properties: 
          overdraftLimit: ขีดจำกัดการถอนเกินบัญชี 
    Methods:
          CheckingAccount(double balance, double overdraftLimit): คอนสตรัคเตอร์สำหรับกำหนดยอดเงินและขีดจำกัดการถอนเกินบัญชี 
          withdraw(double amount): ถอนเงินจากบัญชีโดยคำนึงถึงขีดจำกัดการถอนเกินบัญชี 

`4.การรับค่าจากผู้ใช้เพื่อนำไปสร้างออบเจกต์ให้สมบูรณ์`

    - ในการสร้างออบเจกต์จาก Account (Class แม่) และ SavingsAccount หรือ CheckingAccount (Class ลูก) จำเป็นต้องรับค่าดังนี้: 
    
    Account (Class แม่) ต้องรับค่า: 
    
        balance (double): ยอดเงินคงเหลือในบัญชี 
        SavingsAccount (Class ลูก) ต้องรับค่าเพิ่มเติม: 
        interestRate (double): อัตราดอกเบี้ยเงินฝาก 
        CheckingAccount (Class ลูก) ต้องรับค่าเพิ่มเติม: 
        overdraftLimit (double): ขีดจำกัดการถอนเงินเกินบัญชี 

`5.สรุปค่าที่ต้องรับจากผู้ใช้: `

สำหรับ Account: balance 
สำหรับ SavingsAccount: balance, interestRate 
สำหรับ CheckingAccount: balance, overdraftLimit 

 
