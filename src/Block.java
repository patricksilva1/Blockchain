import java.util.Date;

public class Block {

    private int id;
    private int nonce;
    private long timeStamp;
    private String hash;
    private String previousHash;
    private String transaction;

    public Block(int id, String transaction, String previousHash) {
        this.id = id;
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        generateHash();
    }

    // #region Getters and Setters
    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return this.previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
    // #endregion

    // Here we need to generate the Hash
    public void generateHash() {
        String dataToHash = Integer.toString(id) +
                previousHash + Long.toString(timeStamp) +
                Integer.toString(nonce) +
                transaction.toString();

        this.hash = SHA256Helper.generateHash(dataToHash);
    }

    // Implementing the nonce for miners
    public void incrementNonce() {
        this.nonce++;
    }

    @Override
    public String toString() {
        return "Block [id = " + id + ", hash = " + hash + ", previousHash = " + previousHash + ", transaction = "
                + transaction + "]";
    }

}
