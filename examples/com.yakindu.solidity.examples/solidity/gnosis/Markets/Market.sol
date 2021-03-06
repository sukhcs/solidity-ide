//SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.6.10;
import "../Events/Event.sol";
import "../MarketMakers/MarketMaker.sol";


/// @title Abstract market contract - Functions to be implemented by market contracts
abstract contract Market {

    /*
     *  Events
     */
    event MarketFunding(uint funding);
    event MarketClosing();
    event FeeWithdrawal(uint fees);
    event OutcomeTokenPurchase(address indexed buyer, uint8 outcomeTokenIndex, uint outcomeTokenCount, uint cost);
    event OutcomeTokenSale(address indexed seller, uint8 outcomeTokenIndex, uint outcomeTokenCount, uint profit);
    event OutcomeTokenShortSale(address indexed buyer, uint8 outcomeTokenIndex, uint outcomeTokenCount, uint cost);

    /*
     *  Storage
     */
    address public creator;
    uint public createdAtBlock;
    Event public eventContract;
    MarketMaker public marketMaker;
    uint24 public fee;
    uint public funding;
    int[] public netOutcomeTokensSold;
    Stages public stage;

    enum Stages {
        MarketCreated,
        MarketFunded,
        MarketClosed
    }

    /*
     *  Public functions
     */
    function fund(uint _funding) public virtual;
    function close() public virtual;
    function withdrawFees() public virtual returns (uint);
    function buy(uint8 outcomeTokenIndex, uint outcomeTokenCount, uint maxCost) public virtual returns (uint);
    function sell(uint8 outcomeTokenIndex, uint outcomeTokenCount, uint minProfit) public virtual returns (uint);
    function shortSell(uint8 outcomeTokenIndex, uint outcomeTokenCount, uint minProfit) public virtual returns (uint);
    function calcMarketFee(uint outcomeTokenCost) public view virtual returns (uint);
}
