package org.andestech.learning.rfb18;


public class HomeWork02
{
    public static void main( String[] args )
    {
/*
*
* TODO:
*
* Создать интерфейс IAccount с методами
* withdrawal, checkTransaction, put, report.
*
* Создать классы User, UserAccount (реализующий интерфейс IAccount ).
* Добавить необходимые поля и методы для работы счета.
* Произвести в методе main проверку: создать экземпляры User, UserAccount,
* положить на счёт некую сумму, проверить лимиты, снять сумму, вывести отчёт операций.
 *
* */
    User client_name = new User(new UserAccount(55555,60000));
        UserAccount account = client_name.getAccount();
    account.put(4000);
    account.checkTransaction();
    account.put(7000);
    account.withdrawal(1234);
    account.put(100);
    account.put(4000);
    account.withdrawal(234);
    account.checkTransaction();
    System.out.println(account.report());


    }
}
