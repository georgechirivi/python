from bookings import serializers
from .serializers import PatientSerializer
from .models import Patient

from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework import status

# GET /api/patients => Listar
# POST /api/patients => Crear
# GET /api/patients/<pk> => Detalle
# PUT /api/patients/<pk>/ => Modificar
# DELETE /api/patients/<pk>/ => Borrar

@api_view(['GET','POST'])
def list_patients(request):
    if request.method == 'GET':
        Patients = Patient.objects.all()
        serializer = PatientSerializer(Patients, many=True)
        return Response(serializer.data)
    
    if request.method == 'POST':
        serializer = PatientSerializer(data=request.data) 
        serializer.is_valid(raise_exception=True)
        serializer.save()
        return Response(status=status.HTTP_201_CREATED)

@api_view(['GET', 'PUT', 'DELETE'])
def detail_patient(request, pk):
        try:
            patient = Patient.objects.get(id=pk)
        except Patient.DoesNoExist:
            return Response(status=status.HTTP_404_NOT_FOUND)
        if request.method =='GET':
            serializer = PatientSerializer(patient)
            return Response(serializer.data)
