#include <bits/stdc++.h>

using namespace std;

int main()
{
    //define an empty map container
    map<int, int> mapex;

    //inserting elements in the map
    mapex.insert(pair <int, int> (9, 90));
    mapex.insert(pair <int, int> (10, 100));
    mapex.insert(pair <int, int> (1, 10));
    mapex.insert(pair <int, int> (2, 20));
    mapex.insert(pair <int, int> (3, 30));
    mapex.insert(pair <int, int> (4, 40));
    mapex.insert(pair <int, int> (5, 50));
    mapex.insert(pair <int, int> (6, 60));
    mapex.insert(pair <int, int> (7, 70));
    mapex.insert(pair <int, int> (8, 80));
    
    

    //display the elements in the map

    map <int, int> :: iterator itr;
    cout<< "\n The contents of the map are: \n";
    cout<< "\t Key\t Elements\n";
    for(itr = mapex.begin(); itr != mapex.end(); ++itr)
    {
        cout<< "\t" <<itr->first<<"\t"<<itr->second<<"\n";
    }
    cout<<endl;
    // the keys are sorted automatically

    //deleting an element with key value 3
    mapex.erase(3);
    for(itr = mapex.begin(); itr != mapex.end(); ++itr)
    {
        cout<< "\t" <<itr->first<<"\t"<<itr->second<<"\n";
    }
    cout<<endl;

    //deleting more than one elements
    mapex.erase(mapex.begin(); mapex.find(5));
    for(itr = mapex.begin(); itr != mapex.end(); ++itr)
    {
        cout<< "\t" <<itr->first<<"\t"<<itr->second<<"\n";
    }
    cout<<endl;


}