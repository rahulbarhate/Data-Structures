# Maps in Java

## HashMap

| Funtction &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  | Description |
|--------|---|
boolean **containsKey(Object key)** &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; |  Used to return True if for a specified key, mapping is present in the map.
boolean **containsValue(Object value)** &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | Used to return true if one or more key is mapped to a specified value.
Object **get(Object key)** | It is used to retrieve or fetch the value mapped by a particular key.
**getOrDefault(Object key, V defaultValue)** &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  |  This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. 

# Map in C++ Standard Template Library (STL)

Maps are associative containers that store elements in a mapped fashion. Each element has a key value and a mapped value. No two mapped values can have same key values.

 
## Some basic functions associated with Map:

Function | Description
------------ | -------------
begin() | Returns an iterator to the first element in the map
end() | Returns an iterator to the theoretical element that follows last element in the map
size() | Returns the number of elements in the map
max_size() | Returns the maximum number of elements that the map can hold
empty() | Returns whether the map is empty
pair insert(keyvalue, mapvalue) | Adds a new element to the map
erase(iterator position) | Removes the element at the position pointed by the iterator
erase(const g) | Removes the key value ‘g’ from the map
clear() | Removes all the elements from the map



*Some additional imformation can be found [here](https://www.geeksforgeeks.org/map-associative-containers-the-c-standard-template-library-stl/)*


