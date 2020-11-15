#!/bin/bash
awk -F"," '$4=="Skopje" {print}' PodatociCsv.csv > FilteredOnlyCitySkopje.csv