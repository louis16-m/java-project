def selection_sort_min_max(arr):
    n = len(arr)
    for i in range(n//2):
        min_index = i
        max_index = i
        for j in range(i+1, n-i):
            if arr[j] < arr[min_index]:
                min_index = j
            if arr[j] > arr[max_index]:
                max_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
        if max_index == i:
            max_index = min_index
        arr[n-i-1], arr[max_index] = arr[max_index], arr[n-i-1]
    return arr

arr = [9, 7, 2, 1, 8, 6,]
print(selection_sort_min_max(arr))
