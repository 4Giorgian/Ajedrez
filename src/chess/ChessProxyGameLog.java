package chess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sono Cattivo
 */
public class ChessProxyGameLog implements ChessLog {
 
    private ChessLog realChessGameLog;

    ChessProxyGameLog(ChessLog chessLog) {
        this.realChessGameLog = chessLog;
    }

    @Override
    public void addToLog( String s ){
        if (realChessGameLog == null) {
            realChessGameLog = new ChessGameLog();
            realChessGameLog.addToLog(s);
        } else {
            realChessGameLog.addToLog(s);
        }
    }

    @Override
    public void clearLog(){
        if (realChessGameLog == null) {
            realChessGameLog = new ChessGameLog();
            realChessGameLog.clearLog();
        } else {
            realChessGameLog.clearLog();
        }
    }

    @Override
    public String getLastLog(){
        if (realChessGameLog == null) {
            realChessGameLog = new ChessGameLog();
            return realChessGameLog.getLastLog();
        } else {
            return realChessGameLog.getLastLog();
        }
    }

    
}
