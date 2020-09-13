package com.ScottHorsburgh;

public class BinarySearch <T extends Comparable<T>> {
    public static <T extends Comparable<T>> int search( T[] arr, T item )
    {
        return search( arr, item, 0, arr.length-1 );
    }

    public static <T extends Comparable<T>> int search( T[] arr, T value, int low, int high )
    {
        if ( value == null )
            return -1;
        if( low > high  )
            return -1;
        int mid = low + ( high-low ) / 2;

        if( value.compareTo( arr [mid] ) > 0 )
            return search(arr, value, mid+1, high);
        else if( value.compareTo( arr[mid] ) < 0 )
            return search( arr, value, low, mid-1 );
        else
            return mid;
    }
}