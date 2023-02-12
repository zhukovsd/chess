package com.zhukovsd.board;

import com.zhukovsd.Coordinates;
import com.zhukovsd.File;

import java.util.ArrayList;
import java.util.List;

public class BoardUtils {
    public static List<Coordinates> getDiagonalCoordinatesBetween(Coordinates source, Coordinates target) {
        // допущение - клетки лежат на одной диагонали

        List<Coordinates> result = new ArrayList<>();

        int fileShift = source.file.ordinal() < target.file.ordinal() ? 1 : -1;
        int rankShift = source.rank < target.rank ? 1 : -1;

        for (
                int fileIndex = source.file.ordinal() + fileShift,
                rank = source.rank + rankShift;

                fileIndex != target.file.ordinal() && rank != target.rank;

                fileIndex += fileShift, rank += rankShift
        ) {
            result.add(new Coordinates(File.values()[fileIndex], rank));
        }

        return result;
    }

    public static List<Coordinates> getVerticalCoordinatesBetween(Coordinates source, Coordinates target) {
        // допущение - клетки лежат на одной вертикали

        List<Coordinates> result = new ArrayList<>();

        int rankShift = source.rank < target.rank ? 1 : -1;

        for (int rank = source.rank + rankShift; rank != target.rank; rank += rankShift) {
            result.add(new Coordinates(source.file, rank));
        }

        return result;
    }

    public static List<Coordinates> getHorizontalCoordinatesBetween(Coordinates source, Coordinates target) {
        // допущение - клетки лежат на одной горизонтали

        List<Coordinates> result = new ArrayList<>();

        int fileShift = source.file.ordinal() < target.file.ordinal() ? 1 : -1;

        for (
                int fileIndex = source.file.ordinal() + fileShift; fileIndex != target.file.ordinal();
                fileIndex += fileShift
        ) {
            result.add(new Coordinates(File.values()[fileIndex], source.rank));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Coordinates> list = getHorizontalCoordinatesBetween(new Coordinates(File.D, 4), new Coordinates(File.H, 4));
        System.out.println("list = " + list);
    }
}
