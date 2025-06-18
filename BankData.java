import java.io.*;
import java.util.HashMap;

public class BankData {
    private static final String DATA_FILE = "accounts.dat";
    private static HashMap<Integer, Account> accounts = loadAccounts();

    private static HashMap<Integer, Account> loadAccounts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            return (HashMap<Integer, Account>) ois.readObject();
        } catch (Exception e) {
            return new HashMap<>();
        }
    }

    private static void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean saveAccount(Account account) {
        if (accounts.containsKey(account.getAccountNo())) return false;
        accounts.put(account.getAccountNo(), account);
        saveAccounts();
        return true;
    }

    public static Account getAccount(int accNo) {
        return accounts.get(accNo);
    }

    public static boolean updateAccount(Account account) {
        if (accounts.containsKey(account.getAccountNo())) {
            accounts.put(account.getAccountNo(), account);
            saveAccounts();
            return true;
        }
        return false;
    }
}