public class App {
    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();

        Miner miner = new Miner();

        // Genesis Block
        Block block0 = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, blockChain);

        System.out.println();

        // First Block
        Block block1 = new Block(1, "Transaction1", blockChain.getBlockChain().get(blockChain.getSize() - 1).getHash());

        miner.mine(block1, blockChain);

        System.out.println();

        // Second Block
        Block block2 = new Block(2, "Transaction2", blockChain.getBlockChain().get(blockChain.getSize() - 1).getHash());

        miner.mine(block2, blockChain);

        System.out.println();

        // Third Block
        Block block3 = new Block(3, "Transaction3", blockChain.getBlockChain().get(blockChain.getSize() - 1).getHash());

        miner.mine(block3, blockChain);

        System.out.println();

        // Fourth Block
        Block block4 = new Block(4, "Transaction4", blockChain.getBlockChain().get(blockChain.getSize() - 1).getHash());

        miner.mine(block4, blockChain);

        System.out.println();

        // Fifth Block
        Block block5 = new Block(5, "Transaction5", blockChain.getBlockChain().get(blockChain.getSize() - 1).getHash());

        miner.mine(block5, blockChain);

        System.out.println();

        System.out.println("\n" + "Blockchain: \n" + blockChain);
        System.out.println("Miner's reward: " + miner.getReward());
    }
}
